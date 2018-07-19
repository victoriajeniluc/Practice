
# Object-oriented programming 
	# Classes are like ideas, objects are concrete things, manifestations of their ideas 

	# DEFINITION: 	
		# a programming paradigm that was created to deal with the growing complexity of large software systems. 

	# 4 THINGS THAT MAKE OOP: 
		# Encapsulation
			# => hiding pieces of functionality and making it unavailable to the rest of the code base. (Thus, the data cannot be manipulated or changed without obvious intention)
			# => in Ruby, this is by creating tasks by creating objects and exposing interfaces(i.e methods) to interact with those objects 

		# Polymorphism
			# => ability for data to be represented as many different types. OOP gives us flexibility in using pre-written code for new purposes. 

			# Inheritance
				# => class inherits the behaviors of another class, referred to as the superclass
					# => Allows the power to define basic classes with large reusability and smaller subclasses for more fine-grained detailed behaviors 

			# Module 
				# similar to classes where you an contain shared behavior... but you can't create an object in a module. Module must be mixed in with a class using the include method invocation. 
				# A WAY OF ACHIEVING POLYMORPHISM IN RUBY
				# DEFINITION: a collection of behaviors that is useable in other classes 

				# MIXIN 
					# => behaviors declared in the module are available to the class and its objects. 

		# Instantiation
			# => creating a new object or instance from a class 
#--------------------------------------------------------------------------

# Variables 
	#EXAMPLE 1
	number = 1 
	# => I have created a variable named "number". I have assigned number to 1. "Number" is a name for an object. 
	# => '=' is an assignment operator  

	#EXAMPLE
	number = 2 + 3 * 4 
	# => number = 14 
	# => Ruby evaluates the expression on the right first then assigns it to the name number. 

#--------------------------------------------------------------------------

# Objects / Classes / Methods 
	# An object is an instance of its class 
	# When an object is created from a class, the class is instantiated. (class is the mold and the object is what is created from that mold)
		#^^^ What does this mean? 
			# Classes have a bunch of characteristics, but most importantly, every class defines a number of methods, which is specific to this type of thing
			# Objects inherit methods from their classes. 

	#-----------------------------
	# What is a class? 
		# => Text-book answer: classes are a blue-print for constructing computer models for real / virtual objects 
		# => Reality: classes hold data, have methods that interact with the data, and are used to instantiate objects 
		# => USE CAMELCASE NAMING CONVENTION TO CREATE A CLASS 
	#-----------------------------

	# STATES AND BEHAVIOR 
		# When defining a class ... we focus on: state and behavior 
			# state: track attibutes for individual objects 
			# behavior: what objects are capable of doing 

		# Instance variables keep track of state of the object (the attributes of the individual obects)

		# Instance methods expose behavior for those objects. 

	# Objects have methods 
		# Methods are an object's behavior 
			# AKA "An object's methods are things that the object can do"
		# Methods make code re-usable, by the way of packaging("encapsulating") code and sticking a name to it

		#EXAMPLE 
			# => Think about a person, like a friend of yours. You can ask this person for their name(call a method), and they'll respond back with their name(return it to you). Their name is a piece of knowledge of this person has and the ability to tell you (respond to your question) is a piece of behavior (a method) they have. 

		# Methods add behavior that is useful to have for a particular type of object.

		# A dot is used to call a method on an object 
			#EXAMPLE
				name = "Victoria"
				name.upcase 
				# => "VICTORIA"

		# PASSING AN ARGUMENT 
			# When certain methods need more information in order to do what you ask for. 
			#EXAMPLE 
				name = "Ruby Monstas"
				name.delete("by Mo") #"by Mo" is the argument 
				# => "Runstas"

		# CHAINING METHOD CALLS 
			# When we call a method on an object it will return another object to us. We can then immediately call another method on the new object, and so on. 
			#EXAMPLE 
				name = "Ruby Monstas"
				name.prepend("Oh, hello,").upcase  
				# => "OH, HELLO< RUBY MONSTAS"
					# => We assigned name to a string, then prepend another string to it which returned back a new string to us. Then we immediately called the method upcase to capitalize the whole string for us. 

		# Predicate methods that end with a question mark ? return either true or false 
			#EXAMPLE 
				name = "Ruby Monstas"
				name.start_with?("R")
				# => true 
				name.start_with?("a")
				# => false 

		# Bang Methods end with an exclamation mark, and often modify the object that they are called on 
			#EXAMPLE 
				name = "Ruby Monstas"
				puts name.downcase! 
				puts name 
				# => "ruby monstas"

		# Writing Methods 
			# a name block of code that takes input and returns output 

		# ANATOMY OF METHOD 
			# There are fourt things that constitute a method: 
				# a name 
				# a block of code 
				# (optionally) accepting input 
					# A method's input is referred to as "arguments"
				# returning output 
					# A method's output is referred to as "return value"

		# DEFINING A METHOD 
			#EXAMPLE
				def add_two(number)
					number + 1 
				end 

				# This only defines a method 
				# Ruby reads the code on the top.. finds def (meaning that we are defining a method)
				# Methods need names.. so Ruby will be looking at that next 
				# Since inputs are optional... it can find parenthese which means that the method defined can have a list of things given. 
					# An argument list defines names of objects passed to the method, enclosed by parenthese right after the method name 
				# Method body is the area with number + 1... inside the method body the argumetns are known as local variables. 

		# CALL A METHOD 
			# Ask Ruby to execute the code that the method body has with some give arguments(inputs)
			#EXAMPLE 
				def add_two(number)
					number + 2 
				end 

				puts add_two(3)

				# Ruby will look at the bit add_two(3) first. Ruby will recognize that we are referring to a method defined earlier, and this will tell Ruby that we want to call (execute, use) this method.
				
				# In order to do so, Ruby first needs to look at what’s inside the parantheses () so Ruby can pass it on. Ruby finds the 3 and creates a new object (number) for it.

				# Now Ruby is ready to actually call (execute, use) the method, passing the number 3.

				# Ruby jumps into the method body and assigns the number to the local variable. Ruby will execute the method body (with number) and evaluate to 5. 

				# 5 is returned from the method call. Ruby jumps back out of the method. The expression add_two(3)return the object 5 and printed to the screen.

		# Return values 
			# In Ruby, a method always return exactly one single thing (an object).
			# The returned object can be anything, but a method can only return one thing... it always returns something 
				# If we don't do anything else, then a method will return the return value of the last evaluated statement 

		# Scopes 
			# Names are known (or defined) in a certain scope, and unknown(or undefined) outside of this scope.
				# Certain names, like variable names, are "known" and "visible" inside of the room. 
 	#-----------------------------

 		#EXAMPLE OF CLASS 
	 		#file: good_dog.rb
	 		class GoodDog
	 		end

	 		sparky = GoodDog.new 
	 		# ^^^ In the above example, we created an instance of our GoodDog class and stored it in the variable sparky. 
	 		#Sparky is the object or instance of the class GoodDog

	 	#EXAMPLE OF MODULE 
	 		#file: good_dog.rb 
	 		module Speak 
	 			def speak(sound)
	 				puts "#{sound}"
	 			end
	 		end 

	 		class GoodDog 
	 			include Speak 
	 		end 

	 		class HumanBeing
	 			include Speak 
	 		end

	 		sparky = GoodDog.new 
	 		sparky.speak("ARF!")
	 		# => ARF!

	 		bob = HumanBeing.new 
	 		bob.speak("Hello!")
	 		# => Hello! 

	 		# ^^^ Note that in the above example, both the GoodDog object, which we're calling sparky, as well as the HumanBeing object, which we're calling bob, have access to speak instance method. This is possible through "mixing in" the module Speak. 


		#EXAMPLE OF OBJECTS / CLASSES / METHODS 
				class WhatAreClasses 
					def initialize 
						@data = "I'm an instance data of this object. Hello."
					end 

					def method 
						puts @data.gsub("instance", "altered")
					end
				end 

				object = WhatAreClasses.new
				object.method 
				# => I'm altered data of this object. Hello. 