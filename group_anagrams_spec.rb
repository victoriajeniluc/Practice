require 'rspec'
require './group_anagrams'

describe "group_anagrams" do
	it "downcases the whole array" do 
		expect(downcasing_anagrams(["eat", "tea", "tan", "ate", "nat", "bat"])).to eq(["eat", "tea", "tan", "ate", "nat", "bat"])
	end 

	it "takes two items from the array and checks if they are anagrams" do 
		expect(checking_anagrams("eat", "tea")).to be_truthy
	end 

	it "takes returns back false when two items aren't the same length" do 
		expect(checking_anagrams("eat", "teal")).to be_falsey
	end

	it "takes returns back false when two items aren't anagrams" do 
		expect(checking_anagrams("eat", "bee")).to be_falsey
	end  	
end 