from EstruturaDeDados import EstruturaDeDados

class ArrayList(EstruturaDeDados):
    def __init__(self):
        self.counter = 0
        self.lista = []
        
    def insert(self, chave):
        self.lista.append(chave)
        return self.lista

    def search(self, chave):
        return chave in self.lista
        
    def delete(self, chave):
        if chave in self.lista:
            self.lista.remove(chave)
        return self.lista

    def minimum(self):
        return min(self.lista)

    def maximum(self):
        return max(self.lista)

    def sucessor(self, chave):
        if chave in self.lista and self.lista.index(chave) < len(self.lista) - 1:
            return self.lista[self.lista.index(chave) + 1]
        return False

    def prodessor(self, chave):
        if chave in self.lista and self.lista.index(chave) > 0:
            return self.lista[self.lista.index(chave) - 1]
        return False

r = ArrayList()
r.insert(1)
r.delete(1)
r.insert(4)
r.insert(8)
print(r.maximum())
print(r.minimum())
print(r.search(1))

