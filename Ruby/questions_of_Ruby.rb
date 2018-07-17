# Object-oriented programming 
	# Classes are like ideas, objects are concrete things, manifestations of their ideas 

# Variables 
	#EXAMPLE 1
	number = 1 
	# => I have created a variable named "number". I have assigned number to 1. "Number" is a name for an object. 
	# => '=' is an assignment operator  

	#EXAMPLE@
	number = 2 + 3 * 4 
	# => number = 14 
	# => Ruby evaluates the expression on the right first then assigns it to the name number. 


# Objects / Classes / Methods 


# What is a class? 
	# => Text-book answer: classes are a blue-print for constructing computer models for real / virtual objects 
	# => Reality: classes hold data, have methods that interact with the data, and are used to instantiate objects 

	#EXAMPLE 

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