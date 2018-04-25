require 'rspec'
require './alias_manager'

describe "alias" do
	it "will break the name given into an array" do 
		expect(breaking_name("Victoria Jeni Luc")).to eq(["Victoria", "Jeni", "Luc"])
	end  

	it "will swap the first name and the last name" do 
		expect(swapping_name("Victoria Jeni Luc")).to eq("Luc Jeni Victoria")
	end 

	it "will change each character in the name" do 
		expect(changing_name("Victoria Jeni Luc")).to eq(["M", "a", "d", " ", "K", "i", "o", "o", " ", "W", "o", "d", "u", "u", "s", "o", "e"])
	end 
	it "will change the vowels in the name to the next vowel" do 
		expect(printing_name("Victoria Jeni Luc")).to eq("Mad Kioo Woduusoe")
	end 
end 