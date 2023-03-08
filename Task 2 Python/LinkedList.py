from EstruturaDeDados import EstruturaDeDados
from Node import Node

class LinkedList(EstruturaDeDados):
    def __init__(self):
        self.head = None

    def insert(self, value):
        new_node = Node(value)
        new_node.next = self.head
        self.head = new_node

    def delete(self, value):
        current = self.head
        previous = None
        found = False
        while current and not found:
            if current.value == value:
                found = True
            else:
                previous = current
                current = current.next
        if current:
            if not previous:
                self.head = current.next
            else:
                previous.next = current.next

    def search(self, value):
        current = self.head
        found = False
        while current and not found:
            if current.value == value:
                found = True
            else:
                current = current.next
        return found

    def minimum(self):
        if not self.head:
            return None
        current = self.head
        min_value = current.value
        while current:
            if current.value < min_value:
                min_value = current.value
            current = current.next
        return min_value

    def maximum(self):
        if not self.head:
            return None
        current = self.head
        max_value = current.value
        while current:
            if current.value > max_value:
                max_value = current.value
            current = current.next
        return max_value

    def sucessor(self, value):
        current = self.head
        while current:
            if current.value == value:
                if current.next:
                    return current.next.value
                else:
                    return None
            current = current.next
        return None

    def prodessor(self, value):
        current = self.head
        previous = None
        while current:
            if current.value == value:
                if previous:
                    return previous.value
                else:
                    return None
            previous = current
            current = current.next
        return None
