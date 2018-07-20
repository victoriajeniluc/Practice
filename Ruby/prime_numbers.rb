# Pseudocode 
#----------------------------------------------------

# Create a method that determines a number is prime
	# input: number 
	# output: true or false 
# Create a if / else statement for edge cases 
		# If a number is less than one or equal to 1
			# => return FALSE 
		# If a number is equal to 2
			# => return TRUE 
		# If half of the range of numbers is divisble by 2,
			# =>  return FALSE if not prime, return TRUE if prime 

#----------------------------------------------------

def prime?(n)
  if n <= 1
  # returning back false because 1 is one of the numbers that is considered not prime 
    return false 
  elsif n == 2 
  # returning back true because 2 is one of the numbers that can only be divided by itself(2) and be greater than 1
    return true 
  else 
    return (2..n/2).none? {|i| n % i == 0 }
  end 
end 

puts prime?(2)
