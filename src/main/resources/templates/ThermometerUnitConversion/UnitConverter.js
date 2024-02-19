var celsiusTemperatures = [];

function convertTemperature() {
  var temperatureElements = document.getElementsByClassName("temp");
  var unitElements = document.getElementsByClassName("unit");

  for (var i = 0; i < temperatureElements.length; i++) {
    if(typeof celsiusTemperatures[i] === 'undefined') {
      celsiusTemperatures[i] = parseFloat(temperatureElements[i].textContent);
    }

    if (document.getElementById("convert").checked) {
      // Convert from Celsius to Fahrenheit
      temperatureElements[i].textContent = Math.floor((celsiusTemperatures[i] * 9 / 5) + 32);

      unitElements[i].textContent = "℉";
    } else {
      // Convert from Fahrenheit to Celsius
      temperatureElements[i].textContent = celsiusTemperatures[i];
      unitElements[i].textContent = "℃";
    }
  }
}
