require 'rspec'
require './palindromes'

describe "palindromes" do

	it "checks if it is a string or not" do 
		expect(checks_class("hello")).to be_truthy
	end  

	it "provides an error if it is not a string" do 
		expect(checks_class(9)).to eq("Please enter in a word or a phrase")
	end  

	it "gets rid of the spaces in phrases" do 
		expect(gets_rid_of_spaces_punctuation("hello there")).to eq("hellothere")
	end 

	it "keeps the phrase as it is if there are no spaces" do 
		expect(gets_rid_of_spaces_punctuation("goodbye")).to eq("goodbye")
	end 

	it "reverses the string" do 
		expect(reverses_element("goodbye")).to eq("eybdoog")
	end 

	it "checks if the word is a palindrom or not" do 
		expect(checks_palindrome("hello")).to be_falsey
	end 

	it "checks if the word is a palindrom or not" do 
		expect(checks_palindrome("madam")).to be_truthy
	end 

	it "checks if the phrase is a palindrom or not" do 
		expect(checks_palindrome("Taco cat")).to be_truthy
	end 

	it "checks if the phrase is a palindrom or not" do 
		expect(checks_palindrome("A nut for a jar of tuna")).to be_truthy
	end 

	it "checks if the phrase is a palindrom or not" do 
		expect(checks_palindrome("king, are you glad you are king")).to be_falsey
	end 

	it "checks it clears out all the items that are not words" do 
		expect(gets_rid_of_spaces_punctuation("#{}aa%!")).to eq("aa")
	end 	
end 