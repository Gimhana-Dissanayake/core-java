// Q. What is resizable array how it will be utiilized by ArrayList internally?

// Ans:
// When we create an ArrayList then the initial capacity of ArrayList is 10 elements, that is, ArrayList will createa ny array with 10 elements size, when we add 11 the element after 10 elements addintion then Arraylist will calculate new capacity value with the formula like "currentCapacity*3/2 + 1" and ArrayList will create new Array with the generated new capacity as size and ArrayList will copy all the elements of the old array to new array and Arralist will destroy old array, same process will be repeated every time wehnwe add an element over its capacity.

public class Runner {}
// watch lecture
