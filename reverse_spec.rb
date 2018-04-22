require 'rspec'
require './reverse'

describe Reverse do 
	string = Reverse.new 

	it 'is able to split the string provided' do 
		string_split = string.split_string("Hello")
		expect(string_split).to eq(["H", "e", "l", "l", "o"])
	end 

	it 'should be an array after the split' do
		string_split = string.split_string("Hello")
		expect(string_split.class).to eq(Array)
	end 

	it 'is able to reverse the letters in the string array' do 
		string_reverse = string.rearrange_string("Hello")
		expect(string_reverse).to eq(["o", "l", "l", "e", "H"])
	end 

	it 'is able to join the reversed letters in the array into a string' do 
		string_join = string.join_string("Hello")
		expect(string_join).to eq("olleH")
	end 

	it 'is able to print the reversed phrase' do
		expect { string.print_reverse_string('Hello') }.to output("olleH\n").to_stdout 
	end 

	it 'should be a string after the reverse' do 
		expect(string.join_string('Hello').class).to eq(String)
	end 
end 