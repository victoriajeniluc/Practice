# Pseudocode 
# -------------------------------------------

# Given an array of strings, group anagrams together. 

# Create a method that will take the array
	# input: array 
	# out put: 2D array 

	# Create a method that will iterate through each item to downcase the item 
		# input: array 
		# output: array 

	# Create a method that will take two items in the array, and check if they are anagrams of each other 
		# input: two strings 
		# ouput: boolean 

# Create a loop that will match the first word with the next anagram. Once they are grouped together, shove them into an array. Repeat until the end of the original array. 

# -------------------------------------------

def downcasing_anagrams(array)
	array.map { |item| item.downcase }  
end 

def checking_anagrams(item1, item2)
	if item1.length == item2.length  
		item1.chars - item2.chars == [] 
	end 
end 


