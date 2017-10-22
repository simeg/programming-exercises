use std::io;

fn main() {
    println!(
        "Press C to convert from Fahrenheit to Celsius.\n\
        Press F to convert from Celsius to Fahrenheit.\n\
        Your choice: "
    );

    let choice: String = read_input();

    let is_celsius: bool = choice.trim().to_lowercase().eq("c");

    let tuple: (&str, &str) = match is_celsius {
        true => ("Fahrenheit", "Celsius"),
        false => ("Celsius", "Fahrenheit")
    };

    println!("Please enter the temperature in {}:", tuple.0);
    let temp_input: String = read_input();

    let temp: f32 = temp_input.trim().parse::<>().unwrap();

    let result: f32 = match is_celsius {
        true => fahrenheit_to_celsius(temp),
        false => celsius_to_fahrenheit(temp)
    };

    println!("The temperature in {} is {}.", tuple.1, result);
}

fn read_input() -> String {
    let mut input = String::new();
    io::stdin().read_line(&mut input)
        .expect("Error reading input");
    input
}

fn fahrenheit_to_celsius(fahrenheit: f32) -> f32 {
    (fahrenheit - 32.0) * (5.0 / 9.0)
}

fn celsius_to_fahrenheit(celsius: f32) -> f32 {
    (celsius * (9.0 / 5.0)) + 32.0
}
