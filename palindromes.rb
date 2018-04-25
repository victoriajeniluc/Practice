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
	if element.class == String
		true 
	else 
		"Please enter in a word or a phrase"
	end 
end 


def gets_rid_of_spaces_punctuation(element)
	if checks_class(element) 
		if element.match(/\W/)
			element.gsub!(/\W/, "")
		else 
			element 
		end 
		element 
	end  
	element
end 

def downcases_element(element)
	gets_rid_of_spaces_punctuation(element).downcase
end 

def reverses_element(element)
	reverse_word = ""
	i = element.length - 1 
	until i < 0  
		reverse_word << downcases_element(element)[i]
		i -= 1 
	end 
	reverse_word
end 

def checks_palindrome(element)
	i = 0 
		until i > downcases_element(element).length 
			return false if downcases_element(element)[i] != reverses_element(element)[i]
			i += 1
		end
	return true 
end
