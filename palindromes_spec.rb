require 'rspec'
require './palindromes'

describe "palindromes" do

	it "checks if it is a string or not" do 
		expect(checks_class(9)).to be_falsey
	end  

	it "checks if it is a string or not" do 
		expect(checks_class("hello")).to be_truthy
	end  

	it "takes in only a string" do 
		expect(checks_palindrome("hello")).to be_truthy
	end  

	it "provides an error if it is not a string" do 
		expect(checks_palindrome(9)).to eq("Please enter in a word or a phrase")
	end  

	it "gets rid of the spaces in phrases" do 
		expect(gets_rid_of_spaces("hello there")).to eq("hellothere")
	end 

	it "keeps the phrase as it is if there are no spaces" do 
		expect(gets_rid_of_spaces("goodbye")).to eq("goodbye")
	end 
end 