import random
class RandomizedSet(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.set = set()
        self.list = []
        

    def insert(self, val):
        """
        Inserts a value to the set. Returns true if the set did not already contain the specified element.
        :type val: int
        :rtype: bool
        """
        if val not in self.set:
            self.set.add(val)
            self.list.append(val)
            return True
        return False
        

    def remove(self, val):
        """
        Removes a value from the set. Returns true if the set contained the specified element.
        :type val: int
        :rtype: bool
        """
        if val in self.set:
            self.set.remove(val)
            self.list.remove(val)
            return True
        return False
        

    def getRandom(self):
        """
        Get a random element from the set.
        :rtype: int
        """
        index = random.randint(0,len(self.list)-1)
        return self.list[index]
        


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()