require 'rspec'
require './reverse'

describe "how to split a string" do 
	it 'is able to split the string provided' do 
		string_split = split_string("Hello")
		expect(string_split).to eq(["H", "e", "l", "l", "o"])
	end 

	it 'should be an array after the split' do
		string_split = split_string("Hello")
		expect(string_split.class).to eq(Array)
	end 
end 

describe "how to reverse the letters in the string array" do 
	it 'is able to reverse the letters in the string array' do 
		string_reverse = rearrange_string("Hello")
		expect(string_reverse).to eq(["o", "l", "l", "e", "H"])
	end 
end 

describe "how to join the letters in an array into a string" do 
	it 'is able to join the reversed letters in the array into a string' do 
		string_join = join_string("Hello")
		expect(string_join).to eq("olleH")
	end 

	it 'should be a string after the reverse' do 
		expect(join_string('Hello').class).to eq(String)
	end 
end 

describe "how to print phrase out onto the console" do 
	it 'is able to print the reversed phrase' do
		expect { print_reverse_string('Hello') }.to output("olleH\n").to_stdout 
	end 
end 