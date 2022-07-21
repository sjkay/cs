import itertools
sets = {}
menu = {}
menu['a']="Create a set" 
menu['b']="Show elements of a set"
menu['c']="Create a Cartesian product for two sets"
menu['d']="Create a relation between two sets"
menu['e']="Check if a relation is an Equivalence relation"
menu['f']="Exit"
while True: 
    print('-----------MENU----------')
    for entry in menu: 
        print(entry+')', menu[entry])
    selection=input("Menu choice: ") 
    if selection =='a': 
        print('-----------CREATE SETS-----------')
        print('enter "finish" to stop entering')
        set1n = input('< Enter set name: ')
        while (set1n != 'finish'):
            set1e = []
            newe = input('< Enter element: ')
            while (newe != 'finish'):
                set1e.append(int(newe))
                newe = input('< Enter element: ')
            sets[set1n] = set1e
            set1n = input('< Enter set name: ')
    elif selection == 'b': 
        print('-----------SHOW A SET------------')
        show = input('< Enter set name: ')
        print(sets[show])
    elif selection == 'c':
        print('-----------CREATE A CARTESIAN PRODUCT FOR TWO SETS------------')
        set1 = input('< Enter set name 1: ')
        set2 = input('< Enter set name 2: ')
        set3 = input('< Enter name of Cartesian product: ')
        sets[set3] = list(itertools.product(sets[set1],sets[set2]))
        print(set3, '=', sets[set3])
    elif selection == 'd': 
        print('-----------CREATE A RELATION-----------')
        rel = input('< Enter name of relation: ')
        sets[rel] = []
        print('Enter "finish" if done adding pairs')
        pair = input("Enter two numbers: ")
        while (pair != 'finish'):
            var1, var2 = [int(x) for x in pair.split()]
            sets[rel].append((var1, var2))
            pair = input("Enter two numbers: ")
        print(rel, '=', sets[rel])
    elif selection == 'e': 
        print('-----------DETERMINE IF IT IS AN EQUIVALENCE RELATION-----------')
        reflexive = True
        symmetric = True
        transitive = True
        check = input('< Enter: ')
        for pairs in sets[check]:
            reflexive = reflexive and (pairs[0],pairs[0]) in sets[check] and (pairs[1],pairs[1]) in sets[check]
        for pairs in sets[check]:
            symmetric = symmetric and (pairs[1],pairs[0]) in sets[check]
        for pair1 in sets[check]:
            for pair2 in sets[check]:
                if pair1[1]==pair2[0]:
                    transitive = transitive and (pair1[0],pair2[1]) in sets[check]
        if reflexive and symmetric and transitive:
            print('Result: YES')
        else:
            print('Result: NOT')
    elif selection == 'f': 
        break
    else: 
        print("Unknown Option Selected!")
