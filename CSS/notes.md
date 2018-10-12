#CSS GRID# 
- Brand new layout system in CSS 
	- NOT A FRAMEWORK / LIBRARY 
- It's an addition to the language that allows us to quickly create flexible, two dimensional layouts 

##DEFINE GRID## 
- Take an element and slice it up 
- Then put elements in it 
	Example: 
		.grid1 { 
			display: grid; 
			grid-template-columns: 200px 300px 100px;
			grid-template-rows: 200px 300px 100px;
			grid-gap: 20px;
		}

##DEFINE TRACKS## 
- Columns and Rows 
	Example: 
		.grid2{
			display: grid; 
			grid-template-columns: 200px 300px 100px;
		}

*GRID ITEMS CAN BE ANYTHING*
- As long as it is the direct element from your container such as DIVS / P / IMG 

##EXPLICT vs. IMPLICIT GRID##
- What happens when we have more items than slots? 
	Example: 
		.grid5{
			display: grid; 
			grid-template-columns: 100px 100px 100px; 
			grid-template-rows: 100px 100px; 
		}
	*Once you run out of defined grid spots, the explicit grid ends and the implicit grid begins*

##What about the height of the item?##
- Normally it is set by the tallest item, so it will stretch the space for those that are shorter. 
	- UNLESS YOU SET THE HEIGHT OF THE CONTENT - which in this case is setting the height to be 300px
		Example:
			.grid6{ 
				display:grid; 
				grid-template-columns: 100px 100px 100px; 
				grid-template-rows: 100px 100px; 
				grid-auto-rows: 300px; 
			}

##YOU CAN DO A IMPLICIT GRID## 
- By adding any items to it where you don't state the columns in the grid 
	Example: 
		.grid7 {
			display: grid; 
			grid-auto-rows: 100px;
		}

##AXIS aka GRID-AUTO-FLOW## 
- In flexbox, you can change the axis from left-to-right in a row to top-to-bottom in a column 
- CSS GRID DOES NOT HAVE SOMETHING TO CHANGE THE AXIS 
	- But... Once explicit spots are used up, additional rows are created 
	- We can change the additional rows to additional columns instead!
		Example: 
			.grid9 {
				display: grid; 
				grid-auto-flow: column; 
			}

- You can mix and match the additional rows and columns!
	Example: 
		.grid10 {
			display: grid; 
			grid-auto-flow: column; 
			gid-template-columns: 100px 200px; 
			grid-auto-columns: 300px; 
		}

		| 1 | |   2   | |    3     | |     4    | 

		*1 and 2 are explicit* 
		*3 and 4 are implicit* 
		*THIS CAN CAUSE HORIZONTAL SCROLLING* 

##SIZING TRACKS##
- We can specify the width of the column and the height of the rows with any existing CSS unit 
	Example: 
		.grid11 {
			display: grid;
			grid-template-columns: 50px 10ch 2rem 1in; 
			grid-template-rows: 10wh 100px; 
		}
			*ch - character height* 
			*in - inches* 

##PERCENTAGES - fine when used in combination or auto## 

Example: 
	.grid12 {
		display: grid; 
		width: 100%; 
		border: 10px solid #00ff9b; 
		grid-template-columns: 80% auto; 
	}