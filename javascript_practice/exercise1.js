$(document).ready(function() {
	$("form").submit(function(e){
		e.preventDefault();

		var $form = $(this);

		var container = $form.find("input[name='personname']");

		var nameOfPerson = container.val(); 

		$form.siblings("#list").last().append(`<li>${nameOfPerson}</li>`);

		$form[0].reset();
	})

	
}); 

document.addEventListener('DOMContentLoaded', function() {
	let app = document.getElementById('list');
	let people = app.getElementsByClassName('person');

	for (let person of people) {
		person.addEventListener('click', function() {
			alert(`you clicked on a person ${person.innerHTML}`);
		});
	}
})