# Nome da imagem Docker
IMAGE_NAME := mobile-legends-tool

# Nome do container Docker
CONTAINER_NAME := mobile-legends-container

.PHONY: all build run

# Comando padrão quando apenas 'make' é executado
all: run

# Arquivo para rastrear a última construção
LAST_BUILD := .last_build

# Construir a imagem Docker
build:
	@if [ ! -f "$(LAST_BUILD)" ] || find . -newer $(LAST_BUILD) | grep -q .; then \
		echo "Construindo a imagem..."; \
		docker build -t $(IMAGE_NAME) .; \
		touch $(LAST_BUILD); \
	else \
		echo "Nenhuma alteração detectada, pulando a construção."; \
	fi

# Rodar a aplicação
run: build
	# Parar e remover qualquer contêiner existente com o mesmo nome
	@echo "Parando e removendo o contêiner existente (se houver)..."
	-@docker rm -f $(CONTAINER_NAME) 2>/dev/null || true
	# Executar o novo contêiner
	@docker run --rm -it --name $(CONTAINER_NAME) $(IMAGE_NAME)
