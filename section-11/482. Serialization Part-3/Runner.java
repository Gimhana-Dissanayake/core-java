public class Runner {

}

// To perform Seralization and Deserialization, JAVA has provided two sperate
// byte oriented streams.

// 1. ObjectOutputStream for Serialization.
// 2. ObjectInputStream for Deserialization.

// NOTE: To peform Serialization we have to use FileOutputStream along with
// ObjectOutputStream and to perform Deserialization we have to use
// FileInputStream along with ObjectInputStream.

// If we want to perform Serialization in Standalone applications then we have
// to use a file to store Serialized Data. In this context, to send Serialized
// data to a file we have to use "FileOutputStream" and to get serialized data
// from a file as part of Deserialization we have to use "FileInputStream".

// In general, in java applications, all the objects are not eligible for
// Serialization and Deserialization. If we want to make any object eligible for
// Serialization and DeSerialization then we must implement
// java.io.Serialization marker interface in the respective class.

// Marker interface is an interface, it will provide some abilities to the
// objects at runtime.

// java.io.Serialization marker interface will make an object eligible for
// Serialization and Deserialization. Without implementing java.io.Serialization
// marker interface we are unable to perform Serialization over an Object.