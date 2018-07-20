#WHY OBJECT ORIENTED PROGRAMMING? 

	# How do we create an object in Ruby? Give an example of the creation of an object.
		# => We create an object by defining a class and instantiating it by using the .new method to create an instance, also known as an object.

			class MyClass 
			end

			my_obj = MyClass.new 

	# What is a module? What is its purpose? How do we use them with our classes? Create a module for the class you created in exercise 1 and include it properly.
		# => A module allows us to group reusable code into one place. We use modules in our classes by using the include reserved word, followed by the module name. Modules are also used as a namespace.	 

			module Study 
			end 

			class MyClass 
				include Study 
			end 

			my_obj = MyClass.new 

		# Create a class called MyCar. When you initialize a new instance or object of the class, allow the user to define some instance variables that tell us the year, color, and model of the car. Create an instance variable that is set to 0 during instantiation of the object to track the current speed of the car as well. Create instance methods that allow the car to speed up, brake, and shut the car off.

		# Add an accessor method to your MyCar class to change and view the color of your car. Then add an accessor method that allows you to view, but not modify, the year of your car.

		#	You want to create a nice interface that allows you to accurately describe the action you want your program to perform. Create a method called spray_paint that can be called on an object and will modify the color of the car.

			class MyCar
				attr_accessor :current_speed
				attr_accessor :color
				attr_reader :year 

				def initialize(year, color, model)
					@year = year 
					@color = color
					@model = model 
					@current_speed = 0 
				end 

				def speed_up(number)
					self.current_speed += number 
					puts "You push the gas and accesslate #{number} mph."  
				end 

				def brake(number)
					self.current_speed -= number 
					puts "You push the brake and decelerate #{number} mph." 
				end 

				def shut_down 
					self.current_speed = 0
					puts "Let's park this bad boy!" 
				end 

				def current_speed_reading 
					puts "You are now going #{current_speed} mph."
				end 

				def spray_paint(color)
					self.color = color 
					puts "You have spray painted your car to #{color}"
				end 
			end 

			lumina = MyCar.new(1997, 'chevy lumina', 'white')
			lumina.speed_up(20)
			lumina.current_speed_reading # You are now going 20 mph
			lumina.speed_up(20)
			lumina.current_speed_reading # You are now going 40 mph
			lumina.break(20)
			lumina.current_speed_reading # You are now going 20 mph 
			lumina.break(20)
			lumina.current_speed_reading # You are now going 0 mph 
			lumina.shut_down
			lumina.current_speed_reading # You are now going 0 mph 
			lumina.color = "black"
			puts lumina.year # => 1997
			puts lumina.color # => black 
			lumina.spray_paint("pink") # You have spray painted your car to pink 

