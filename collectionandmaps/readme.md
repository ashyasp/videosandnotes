A Collection is an object that holds references to other objects. These are data structures and the objects within the collection are known as elements.


#Collections Framework
Java provides a collections framework which consists of interfaces, classes and methods to store and manipulate aggregate data.

Some collections allow duplicate elements, while others require every element to be unique.

Some collections are ordered, while others are not.

All of the interfaces and classes for the collections framework can be found in the java.util package.

Let's take a look inside of the Collections Framework.

Collection itself is an interface and is the root of the hierarchy. Java does not provide any direct implementations of the Collection interface, but there are other interfaces which inherit from Collection.

Set
Set is a collection which cannot contain duplicate elements.

An example use case for Set would be a standard deck of 52 playing cards, where each card would be an element in the collection and each of them are unique.


#List
List is a collection where the elements are ordered.

List can contain duplicate elements.

An example of where List might be used would be the phone numbers from your call history. They are listed in order and some numbers may appear more than once.


#Queue
Queue is a collection of ordered elements, which is typically used to hold items that are going to be processed in some way.

An example use case would be the people in the checkout line at a supermarket. People who are new to the queue are added at the end and the processing of the queue is handled from the beginning. This type of processing is well known as first in-first out (FIFO).


#Map
Then finally we have Map, which is not a true collection, meaning it does not inherit from the Collection interface. However, it contains collection-like operations, which enable them to be used as collections.

Maps are used to hold key/value pairs.

An example for this would be a list of bank transactions where each Map entry has a unique transaction ID serving as the key and the value would be the actual transaction object.

Again, a Set is an unordered collection of unique objects. Because Set is an interface, it cannot be instantiated, but it can be an object's type. This is demonstrated on line 1.

Some implementations of Setare HashSet, LinkedHashSet and TreeSet. I won't go into details for these; however, I have placed a link in the resources section should you want to go deeper on this topic.

Notice in our example here, we use the add method to place items into the set. Note that if I did attempt to add a duplicate to the set, like we're doing with “lemon” on line 6, no error would occur. However, the duplicate elements simply would not be stored.

When we call fruit.size() on line 8, we're returned with the number 4.

When I print out the set on line 9, the order is not the same order that I added the elements to the set. Since the set is unordered, we have no control over where our elements will be placed.

You can access an element in a Map by its key. While the keys are required to be unique, the values are not.

Popular implementations of the map interface are HashMap, TreeMap and LinkedHashMap, which you can read more about in the Javadocs.

Let's say that we wanted to add calorie information for each of the fruits. We can use the fruit name as a key and the calories as the value.

Remember, a Map is not technically a Collection, meaning it does not inherit from the Collection interface.

Map does not have access to the add method that we've seen in the other data structures.

Map has a put method, which is used to add the elements. The put method takes two arguments — a key and a value. We are using the fruit’s name as the key and the calories as the value.

The Collection interface provides an iterator for you, in order to loop through a collection. For example, the Set is an unordered collection so there are no methods on Set that will allow us to get a certain item by its index, for example.

But we can use this iterator and let's just assign this to, we'll call it i. The iteratorwill allow you to go through each of the items in this collection.
his is a boolean expression — meaning while we have another element in the set, this will return true as long as we're not at the end of the collection, and once we've gone through all of them it will return false.

Once we're inside of the loop, let's just print them out. We can use i.next() which will return an object and it will be whatever type of object is inside of this particular collection.
Every item in this Set is a String, so we can say String item, and we want to iterate over fruit.

for(String item: fruit){

}
Notice, I have an error here. This says incompatible types, so this is an Object, but we're saying that it's a String.




That's because Collections are generic, in that they just store an Object, and since Object is the grandparent to every class in Java, then that is safe to use.

If we wanted to be more specific, and we wanted to say that this was holding Strings, we could do that with this diamond operator, which is essentially just two angle brackets (<>).

We would make this change to the declaration line for fru
We can't use those exact same methods on the Map because, again, the Map is not a Collection.

To iterate over the Map we can use an enhanced for loop, but we can't just iterate over the Map itself.

We can, however, say give us the entrySet — which will give us a Set object. Once we have this Set object, then we can print out the value from the set.

for(var entry : fruitCalories.entrySet()){
System.out.println(entry.getValue());
}
We used entry.getValue(), however this is red and it's saying it doesn't know what this is.




This is a Set of a Map and entry is now a Map, but again, it's type is just Object.

We can specify the specific type with the diamond operator.

For a Map you need to provide two data types:

One for the key, so our key is a String.
The other for the value. The value is an int.
Because Map takes two objects, we can't just specify the int as the primitive data type, we have to use the wrapper class Integer which would then be an object.

public static void mapDemo(){
Map<String,Integer> fruitCalories = new HashMap();
fruitCalories.put("apple", 95);
fruitCalories.put("lemon", 20);
fruitCalories.put("banana", 105);
fruitCalories.put("lemon", 17);

    for(var entry : fruitCalories.entrySet()){
        System.out.println(entry.getValue());
    }
}
Now, notice getValue() works because it knows that this entry is a Map of a String and an Integer.

Let's run this and make sure all our values are there.

Output

105
45
95
17
Yep, those are all of our values.


#Map: forEach
I want to show you one more way to iterate over a Map.

A Map also has access to the forEach() method. We can say fruitCalories.forEach() and inside of here we can pass a key and a value.

Let me put this on another line.
fruitCalories.forEach(
(k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));
I've just given it a little short-term name (k for the key, and v for the value). We don't need a data type because, again, this is only known inside of this forEach(). We give it the little dash and the arrow and then we're going to say the action is to println().

That will print this sentence for each of these. Let's see this. Voila!





