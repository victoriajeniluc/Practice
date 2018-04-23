require 'rspec'
require './prime_numbers'

describe "prime?" do 
	it "determines a number is not prime" do 
		expect(prime?(18)).to be_falsey
	end

	it "determines a number is prime" do 
		expect(prime?(11)).to be_truthy
	end  

	it "determines 2 to be a prime" do 
		expect(prime?(2)).to be_truthy
	end 

	it "determines 1 to not be a prime" do 
		expect(prime?(1)).to be_falsey
	end 
end 