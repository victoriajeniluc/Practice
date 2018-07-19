#WHY OBJECT ORIENTED PROGRAMMING? 

	# How do we create an object in Ruby? Give an example of the creation of an object.
		# => We create an object by defining a class and instantiating it by using the .new method to create an instance, also known as an object.

			class MyClass 
			end

			my_obj = MyClass.new 

	# What is a module? What is its purpose? How do we use them with our classes? Create a module for the class you created in exercise 1 and include it properly.
		# => A module allows us to group reusable code into one place. We use modules in our classes by using the include reserved word, followed by the module name. Modules are also used as a namespace.	 

			module Study 
			end 

			class MyClass 
				include Study 
			end 

			my_obj = MyClass.new 