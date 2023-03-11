import requests
from bs4 import BeautifulSoup
import json

# Make a GET request to the website
url = "https://mobile-legends.fandom.com/wiki/List_of_heroes"
response = requests.get(url)

# Parse the HTML content using BeautifulSoup
soup = BeautifulSoup(response.content, "html.parser")

# Find the table containing the list of heroes
table = soup.find("table", class_="wikitable sortable")

# Extract the table rows
rows = []
for tr in table.find_all("tr"):
    row = []
    for td in tr.find_all("td"):
        row.append(td.text.strip())
    if len(row) > 0:
        rows.append(row)

# Create a list of dictionaries representing each row
heroes = []
for row in rows:
    # Replace spaces in the hero name with underscores
    name = row[1].replace(" ", "_")
    hero = {
        "Name": name,
        "Role(s)": row[3],
        "Specialties": row[4],
        "Laning": row[5]
    }
    heroes.append(hero)

# Save the output to a file
with open("heroes.json", "w") as f:
    json.dump(heroes, f, indent=4)

# Print a confirmation message
print("The output has been saved to heroes.json.")