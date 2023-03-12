## This script return all the words in the behaviours.json without repetitions, granting that there's no mispelling 
import json

def get_words_from_json(json_data):
    words = set()

    if isinstance(json_data, str):
        words.update(json_data.split())
    elif isinstance(json_data, dict):
        for key, value in json_data.items():
            words.update(get_words_from_json(value))
    elif isinstance(json_data, list):
        for item in json_data:
            words.update(get_words_from_json(item))

    return sorted(words)

json_file = "heroes.json"
with open(json_file, 'r') as f:
    data = json.load(f)
words = get_words_from_json(data)
print(words)