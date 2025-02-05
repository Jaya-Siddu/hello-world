class Cat {}
class Dog {}
class Car {}
public class ArrayPrinter {
    public static <T> void print(T[] arr) {
        for (T each : arr) {
            System.out.println(each);
        }
    }
	public static <T> T first(T[] arr)
	{
		return(arr[0]);
	}
	public static <T> void swap(T[] arr)
	{
		T tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
	}
    public static void main(String[] args) {
        // Creating arrays of different types
        Cat[] cats = {new Cat(), new Cat()};
        Dog[] dogs = {new Dog(), new Dog()};
        Car[] cars = {new Car(), new Car()};
        
        Integer[] integers = {1, 2, 3, 4};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4};
		print(cats);
		//print(dogs);
		//print(cars);
		print(integers);
		//print(doubles);
		//System.out.println(first(cats));
		//System.out.println(first(integers));
		swap(integers);
		swap(cats);
		print(cats);
		//print(dogs);
		//print(cars);
		print(integers);
		

    }
}

/*
Print all elements
Return first element 
Swap first two elements
Reverse the list 
Add the list
*/