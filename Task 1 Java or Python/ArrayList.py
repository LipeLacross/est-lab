from EstruturaDeDados import EstruturaDeDados


class ArrayList(EstruturaDeDados):
    def __init__(self):
        self.counter = 0


r = ArrayList()
r.insert(1)
print(r.search(1))
