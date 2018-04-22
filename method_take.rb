# Pseudocode 
#------------------------------------

	# Create a method that will return back an item starting with the number that is given and ending at the end of the item  
		# input: array / string, number 
		# output: array / string 
			#Use the array and its indexes
				# Let the number be the starting point of the array/ string 
				# Let the length be the ending point of the array/ string

	### BASICALLY REDOING THE TAKE METHOD BUT WITH A STARTING POINT 

#------------------------------------

def take(array, n)
	array[n, array.length]
end 

puts take([1,2,3], 1)