
# Pseudocode 
# -----------------------
# Create a method to reverse a string 
	#input: a string 
	#output: a string 
	# Split the string into an array 
		#input: a string 
		#output: an array
	# Create a loop with the array to switch the letter 
		#input: an array 
		#output: an array with reverse letters 
	# Turn the array back into a string 
# -----------------------

def split_string(string)
  string.split("")
end

def rearrange_string(string)
  string_array = split_string(string)
  container = []
  string_array.length.times { container << string_array.pop }
  container
end  

def join_string(string)
  rearrange_string(string).join("")
end

def print_reverse_string(string)
  puts join_string(string)
end  
