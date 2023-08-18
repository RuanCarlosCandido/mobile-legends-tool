
# mobileLegendsTool

An algorithm to suggest good counter heroes in ranked matches in the Mobile Legends game.

The highest known physical defense that can ever be obtained is 1380 ([source](https://mobile-legends.fandom.com/wiki/Physical_defense)). Thus, 8% of 1380 equals 110. This means that in a very rare situation, the tank emblem's fortress skill can increase the physical defense by a maximum of 110.

## How to Build and Run

### Building the Application

1. Ensure you have Docker installed on your system.
2. Navigate to the project directory.
3. Build the Docker image:
   ```bash
   docker build -t mobile-legends-tool .
   ```

### Running the Application

After building, you can run the application with:

```bash
docker run --rm -it --name mobile-legends-container mobile-legends-tool
```

This command will start the application inside a Docker container, and you can interact with it directly from the terminal.
