# Pseudocode 
# -------------------------------------------

# Create a method that will determine whether a string is its own a palidrome 
	# input: string 
	# output: boolean 

# Create a loop that will go through each character in the string at the beginning. 
	# If the each character in the beginning matches the end of the string, 
		# Palindrome 
	# Else 
		# Not Palindrome 
# -------------------------------------------

def checks_class(element)
	element.class == String 
end 

def gets_rid_of_spaces(element)
	if element.include?(" ")
		element.delete(" ")
	else 
		element 
	end 
end 

def downcases_element(element)
	gets_rid_of_spaces(element).downcase
end 

def checks_palindrome(element)
	if checks_class(element)
		 downcases_element(element)
	else
		"Please enter in a word or a phrase"
	end  
end 