# Pseudocode 
# -------------------------------------------

# Create a method that will change a user's name 
	# input: name (string)
	# output: alias name (string)


# For the first name and last name, it will swap them.
	# If there is a middle name, it will remain in the middle 
		# Break the name into an array and swap the first and last name and join it back into a string 
			# input: name (string)
			# output: swapped name (string)

# For every vowel in the name, it will be switched the to next vowel in the line (ex: E will become I, O will become U)
	# Create a loop that will search through the whole name and the whole vowel string
	# If the vowel is found, it will be inserted into the alias name string 

# For each constant, the name it will be the next constant in the alphabet 
	# Create a loop that will search through the whole name and the whole alphabet string 
	# If the constant is found, it will be inserted into the alias name string 

# -------------------------------------------

def breaking_name(name)
	name.split(" ")
end 

def swapping_name(name)
	name_array = breaking_name(name)
	name_array[0], name_array[name_array.length-1] = name_array[name_array.length-1], name_array[0]
	name_array.join(" ")
end 

def changing_name(name)
	name_characters = swapping_name(name).chars 

	name_characters.map do |character| 
		if character == "a"
			"e"			
		elsif character == "e"
			"i"
		elsif character == "i"
			"o"
		elsif character == "o"
			"u"
		elsif character == "u" 
			"a"
		elsif character == " " 
			" "
		else 
			character.next
		end 		
	end 
end 

def joining_name(name)
	changing_name(name).join("")
end 

def printing_name(name)
	joining_name(name)
end

printing_name("victoria jeni luc")