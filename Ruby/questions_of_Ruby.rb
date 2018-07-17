
# Object-oriented programming 
	# Classes are like ideas, objects are concrete things, manifestations of their ideas 
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
	# When an object is created from a class, the class is instantiated. 
		#^^^ What does this mean? 
			# Classes have a bunch of characteristics, but most importantly, every class defines a number of methods, which is specific to this type of thing
			# Objects inherit methods from their classes. 

	#-----------------------------
	# What is a class? 
		# => Text-book answer: classes are a blue-print for constructing computer models for real / virtual objects 
		# => Reality: classes hold data, have methods that interact with the data, and are used to instantiate objects 
	#-----------------------------
	# Objects have methods 
		# Methods are an object's behavior 
			# AKA "An object's methods are things that the object can do"

		#EXAMPLE 
			# => Think about a person, like a friend of yours. You can ask this person for their name(call a method), and they'll respond back with their name(return it to you). Their name is a piece of knowledge of this person has and the ability to tell you (respond to your question) is a piece of behavior (a method) they have. 

		# Methods add behavior that is useful to have for a particular type of object.
	#-----------------------------


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