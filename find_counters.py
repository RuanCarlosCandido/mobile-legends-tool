import json
import requests
from bs4 import BeautifulSoup

# read heroes.json file
with open('heroes.json') as f:
    heroes = json.load(f)

for hero in heroes:
    hero_name = hero['Name']
    url = f'https://zathong.com/{hero_name.lower()}-counter-mobile-legends/'
##https://zathong.com/miya-build-mobile-legends/ usar esse endpoint tmb


    # make request to zathong.com
    response = requests.get(url)

    # check if request was successful
    if response.status_code == 200:
        # scrape website to find counters
        soup = BeautifulSoup(response.content, 'html.parser')
        gallery = soup.find('div', {'id': 'gallery-1'})

        # check if gallery element was found
        if gallery is not None:
            counters = []
            for image in gallery.find_all('img'):
                counters.append(image['alt'])

            # add counters to hero dictionary
            hero['counters'] = counters
        else:
            print(f'Error: Gallery element not found for hero {hero_name}')
    else:
        print(f'Error: Failed to retrieve page for hero {hero_name}. Status code: {response.status_code}')

# save updated heroes.json file
with open('heroes_with_counters.json', 'w') as f:
    json.dump(heroes, f, indent=4)
