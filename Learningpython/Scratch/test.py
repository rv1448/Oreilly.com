listnew = [1,23,4,5,6]
print(listnew.__getitem__(1))


import collections

Card = collections.namedtuple('Card','rank suit')


class FrenchDeck(object):
    ranks = list(range(2,10))+list('JQKA')
    suits = 'spades diamond clubs heart'.split()

    def __init__(self):
        self.cards = [Card(rank,suit) for suit in self.suits
                      for rank in self.ranks
                                      ]

    def __len__(self):
        return len(self.cards)

    def __getitem__(self, item):
        return self.cards[item]

    def __repr__(self):
        return str(self.cards)


frechdeck = FrenchDeck()

print(frechdeck)
