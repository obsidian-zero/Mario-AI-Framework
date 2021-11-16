with open(r'levels\original\lvl-1.txt') as f:
    content = f.read()
content.count('!') + content.count('C') + content.count('o') + content.count('2') + content.count('Q')
