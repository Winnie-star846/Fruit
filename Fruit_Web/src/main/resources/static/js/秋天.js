document.addEventListener('DOMContentLoaded', () => {
    const fruits = document.querySelectorAll('.fruit');
 
    fruits.forEach(fruit => {
        fruit.addEventListener('click', () => {
            alert(`Name: ${fruit.getAttribute('data-name')}\nSeason: ${fruit.getAttribute('data-season')}\nType: ${fruit.getAttribute('data-type')}\n\n${fruit.querySelector('p').textContent}`);
        });
    });
});