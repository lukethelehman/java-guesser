# java-guesser
Number guesser program writtenn in Java for CS-121

## algorithm 

```
Guesser()
  bool keepGoing gets True
  while keepGoing is True
    string response gets menu()
    if response equals 0
      keepGoing gets False
    if response equals 1
      run humanGuesser()
    if response equals 2
      run computerGuesser()

menu()
  print "0) Exit
         1) Human Guesser
         2) Computer guesser"
  store user input into string response
  return response

humanGuesser()
  create random int from 1-100 named correct
  create int guess
  create int turns
  bool keepGoing gets True
  while keepGoing is True
    add one to turns
      ask user for guess, store input to guess
    if guess is less than correct
      print "too low..."
    if guess is greater than correct
      print "too high..."
    if guess is equal to correct
      print "You got it! it took you <turns> turns"
      keepGoing gets False

computerGuesser()
  create int lowerBound equals 1
  create int upperBound equals 100
  create int turn gets 1
  create int guess
  create string response
  create bool keepGoing gets True

  while keepGoing is True
    guess gets getMean(lowerBound, upperBound)
    print "<turn>) I guess <guess>
    print "Too (H)igh, too (L)ow, or (C)orrect?"
    store input to response
    if response equals h
      upperBound gets guess
      guess gets getMean(lowerBound, upperBound)
    if response equals l
      lowerBound gets guess
      guess gets getMean(lowerBound, upperBound)
    if response equals c
      keepGoing gets False

getMean(lowerBound, upperBound)
  create int mean
  mean equals lowerBound plus upperBound divided by two
  return mean 
      
  

  

