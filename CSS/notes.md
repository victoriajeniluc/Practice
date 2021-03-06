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
		- Basically going to be the first column is 80% and the rest is auto - or fill up the remaining space 
		- NOT ADDING UP TO 100% 
			80% + 20% + 20px == ??? 
^^^ SO A SOLUTION TO THIS: Fractional units 

##FRACTIONAL UNITS## 
- new unit to CSS 
- basically what they are known as "free space"

*CHANGING THE EXAMPLE FROM GRID12 to fractional unnits* 
	Example: 
		.grid14{
			display: grid; 
			grid-gap: 20px;
			width: 1000px;
			border: 10px solid #00ff9b; 
			grid-template-columns: 8fr 2fr; 
		}
		*meaning: it will take up 8 times of the free space and the other proportion will take up 2 times the free space* 

##HOW DO FR WORK?##
- The browser will first dedicate space towards the things that need a specific amount of room - exisiting content, fixed sized tracks and grid-gap then... the remaining space will be divided up in proportion - much like flex-grow.
	Example: 
		.grid15{
			display: grid; 
			width: 100%; 
			grid-gap: 50px; 
			grid-template-columns: 2fr 500px 1fr; 
		}

##THE repeat() FUNCTION## 
- allows us to repeat the tracks through out the grids 
- it can be used multiple times 
	Example: 
		.grid17{
			display: grid; 
			grid-template-columns: repeat(5, 1fr);
		}

	Example: 
		.grid18{
			display: grid;
			grid-template-colums: repeat(3, 1fr) repeat(2, 2fr)
		}

	Example:
		.grid19{
			display: grid;
			grid-template-columns: 200px repeat(3, 1fr) 200px; 
		}

##SIZING - the items inside the grid## 
- Using a fixed width 

	Example: 
		.grid20{	
			display:grid; 
			grid-template-columns: repeat(5, 1fr);
		}

		.grid20 .item:nth-child(3){
			width:300px;
			background: #00ff9b; 
		}

		*Problem with this is that once you expand one item... it will expand the others that are within that column* 

- Spilling into rigid tracks 
	Example: 
		.grid21{ 
			display: grid; 
			grid-template-columns: repeat(5, 100px); 
		}

		.grid21 .item:nth-child(3){
			width: 600px; 
			background: #00ff9b;
		}

		*Problem with this is that if your item is bigger than the column size, it will spill under the other items within that row* 

##SOLUTION TO SIZING ITEMS##
- In most cases, the best way to size grid items is to span multiple grid spots 

	Example: 
		.grid22{
			display: grid; 
			grid-template-columns: repeat(5, 100px);
		}

		.grid22 .item:nth-child(3){
			grid-column: span 3;
			background: #00ff9b;
		}

		*Problem with this sometimes is that if the item is too big.. it will push it into the next track, leaving space behind ... example below* 
			Example: 
				.grid23{ 
					display: grid; 
					grid-template-columns: repeat(5, 100px);
				}

				.grid23 .item:nth-child(3){
					grid-column: span 4; 
					background: #00ff9b;
				}

##SOLUTION to fixing items from flowing into the next track##
- grid-auto-flow: dense FIXES THIS 

	Example: 
		.grid24{ 
			display: grid;
			grid-auto-flow: dense;
			grid-template-columns: repeat(4, 100px);
		}

		.grid24 .item:nth-child(3){
			grid-column: span 4;
			background: #00ff9b;
		}

		*Grid-auto-flow:dense will put all the items in the space that it needs.. so if item 1, 2 fit in the track of 100px... it will be in its places. Though, item 3 spans to 4... so it will be placed in the next track. Item 4 that is 100px will be in the same track as 1 and 2. ORDER WILL CHANGE.* 

##LINE NUMBERS##
- Tracks are numbered by their gutters, not the tracks 

- We can tell an item where to start and/or stop 
	Example: 
		.grid25{
			display: grid; 
			grid-auto-flow: dense;
			grid-template-columns: repeat(5, 100px);
		}

		.grid25 .item:nth-child(3){
			grid-column: 2/5; 
			background: #00ff9b;
		}

		*This is what it means: start at the 2nd track and span until 5* 

- -1 spans to the end of the explicit grid 
	Example: 
		.grid26{
			display: grid; 
			grid-auto-flow: dense;
			grid-template-columns: repeat(5, 100px);
			grid-template-rows: repeat(7, 100px);
		}

		.grid26 .item:nth-child(3){
			grid-row: 4/-1
			background: #00ff9b;
		}

		*This is what it means: start at the 4th track and span until the end of the grid* 

- ANOTHER EXAMPLE: 
	.grid27{
		display:grid; 
		grid-template-columns: repeat(5, 100px);
		grid-template-rows: repeat(7, 100px);
	}

	.grid27 .header {
		grid-column: 1/-1; 
		grid-row: 1; 
		background:white; 
	}

##SPECIFY WHERE AN ITEM ENDS##
Example: 
	.grid28{
		display;: grid; 
		grid-template-columns: repeat(5, 100px);
		grid-template-rows: repeat(7, 100px);
	}

	.gid28 .item:nth-child(3){
		grid-column-end: 5; 
		grid-column-start: span 3;
		grid-row-end: -1; 
		grid-row-start: span 5; 
		background: #00ff9b;
	}

*What we did here is... to start at the bottom of the right hand corner of the grid... then span 3.. how many rows.. then span 5. - Basically filling from the bottom to the top of the section* 

##AUTO-FIT AND AUTO-FILL##
Example: Grid with a flexible width and 20px of gap. How many 100px tracks can we fit? 
PROBLEM OF ANSWERING WITH A NUMBER SPECIFIC: you won't be really sure because it's flexible of a browser and it can fit as many since it expands and shrinks as you changing the sizing of the browser. 3 tracks on a phone compared to a 40in monitor can look very different 

##Solution to this problem##
- Auto-Fit and Auto-Fill: 
	- Giving  a specific size of the track.. repeat as many times as you can 
		Example: 
			.grid29{
				display: grid; 
				grid-template-columns: repeat(auto-fill, 100px);
				border: 10px solid red; 
				transition: all 1s; 
				width: 900px; 
			}

			.grid:hover{
				width: 300px;
			}

##AUTO-FILL VS. AUTO-FIT##
- Auto-fit 
	- Will NOT create tracks out of empty space  
- Auto-fill
	- will create tracks out of empty space 
	- having a larger grid than the items you have
- WHICH ONE TO USE? 
	- Up to the user's preference... sometimes you may want to use auto-fill to be able to create an extra track in case. 

##WHY DO WE USE AUTO-FILL AND AUTO-FIT## 
- BECAUSE OF MINMAX() 
	- Takes two arguments, a min and a max 
	Example: 
		grid-template-columns: repeat(auto-fill, minmax(350px, 1fr));
		*This is saying.... make this grid repeat as many tracks that have a minimum width of 350px... but if they are bigger than that... use the max of 1fr- could potentially stretch accross the browser*
	Example: 
		.grid50{
			display: grid; 
			grid-template-columns: repeat(auto-fill, minmax(350px, 1fr));
			border: 10px solid red; 
			overflow: auto; 
			resize: horizontal;
		}
	- ALLOWS THIS TO BE RESPONSIVE WITHOUT MEDIA QUERIES
	- CONTAINER AWARE - NOT BASED ON VIEWPORT 
	- HANDY AS HECK - MOST USED PARTS OF GRID 

##GRID TEMPLATE AREAS## 
- Another way to define where items go is the create areas on your grid and name them 
- The grid sets up the template where the items would be the class name of the element 
	Example: 
		.grid {
			display: grid;
			grid-template-columns: repeat(4, 100px); 
			grid-template-areas: 
				'head head head head'
				'side side main main'
				'ads ads main main'
				'foot foot foot foot'
		}
		.header {
			 grid-area: head;
		}
		.side {
			 grid-area: side;
		}
		.main {
			 grid-area: main;
		}
		.ads {
			grid-area: ads;
		}
		.foot { 
			grid-area: foot; 
		}

##NAMED LINES##
- When you name areas, you get named for free 
	Example: 
		grid54 {
			display: grid;
			grid-template-columns: repeat(4, 200px);
			grid-auto-row: 200px; 
			gid-template-areas: 
				'outter-left content content outter-right'
				'outter-left content content outter-right'
				'outter-left content content outter-right'
				'footer footer footer footer'
		}
		.grid54 .item:nth-child(1){
			grid-column: content-start / content-end; 
			grid-row: content-start / content-end; 
			background: green;
		}

- YOU CAN CREATE YOUR OWN NAMES 
	Example: 
		.grid55 {
			display: grid; 
			grid-template-columns: 
				[sidebar-start site-left]
				1fr
				[sidebar-end content-start]
				500px
				[content-end]
				1fr
				[site-right];
			grid-template-rows:
				[content-top]		
				repeat(10, auto)
				[content-bottom];
		}
		.grid55 {
			background: slateblue;
			grid-column: content-start; 
			grid-row: content-top / content-bottom;
		}	

##ALIGNMENT AND CENTERING##
- CSS Grid is amazing for just aligning elements 
- 6 alignment properties: 
	- justify -* : for rows axis - horizontal 
		- how to align the tracks 
			- justify-content: 
				- start 
				- center 
				- end 
				- space-between 
				- space-around 
		- how to align the items: 
			- justify-items: 
				- stretch
				- center
				- start
				- end
				- self : overrides 
	- align -# : for columns axis - vertical 
		- how to align the tracks:
			- align-content: 
				- start
				- center 
				- stretch 
				- end 
				- space-around
				- space-between 
		- how to align the items: 
			- align-items: 
				- stretch
				- center 
				- start 
				- end 
				- baseline : will align the text of within the items 
	Example: 
		.grid56 {
			display: grid;
			grid-template-columns: repeat(3, 100px);
		}
