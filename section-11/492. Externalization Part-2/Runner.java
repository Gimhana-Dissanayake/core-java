// 1. Prepare Exterlizable Class and Object.
// a) Declare an User defined class.
// b)Implement java.io.Externalizable interface in user defined class.
// c) In User defined class, implement all the methods of Externalizable interface
// d) Provide a 0-arg constructor explicitly inorder to create deserilaized object

// 1. writeExternal(ObjectOutput oop) --> 1.It will be executed at the time of serialization.2->It will include logic to perform manipulations over the data which we want Serialize.3--> After the manipulation, Send data for Serialization by using the fallowing methods from ObjectOutput
// public void writeXxx(xxx value)--> where xxx may be byte, short, int, UTF[String]...

// 2. readExternal(ObjectInput oip) --> It will be executed at the time of Deserilaization. It will include the logic to perform manipulationsover the Deserializaed data. To perform manipulations get Deerialized data from objectInput. Send Manipulated data to java application

// 2. Perform Seriliazation and Deserilaization over the externalizable object:
// Steps are same as Serialization and Deserialization

class Runner {

}

// watch the lecture