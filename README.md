# JAVA22-TDD-Miniprojekt1-Erik-Andersson
final

testInput: 
Testet är viktigt eftersom den kontrollerar användarinput. Med input '3,4,5' säkerställer den att aktuell typ identifieras som SCALENE, vilket validerar förmågan att hantera giltig input.

getUserInputLength: 
Verifierar att koden hanterar inmatning med längd större än 3. Om inmatningens längd är ogiltig blir det null. Testet säkerställer ogiltiga inmatningslängder.

correctInputType: 
Säkerställer att koden hanterar inmatningsarray med non-integer element på rätt sätt. Om arrayen innehåller non-integer element blir det null. Detta test skyddar mot fel inmatningstyp.

getInvalidInput: 
Kontrollerar om koden korrekt hanterar användarinput med ogiltiga tecken. Om ogiltiga tecken finns blir det null. Testet finns för specialtecken.

getInvalidInputLength: 
Liknande getUserInputLength men testar specifikt fallet där användarinput har ogiltig längd. Ännu ett test som säkerställer att koden hanterar olika scenarier med ogiltiga inmatningslängder.

getTriangleIsosceles: 
Kontrollerar att koden korrekt identifierar ISOSCELES när triangeln skapas med sidorna 3, 3 och 5. Testet identifierar vilken triangeltyp det är.

getTriangleEquality: 
Testar när en triangel skapas med sidorna 1, 1 och 2 att det blir null, eftersom det inte är en giltig triangel. Testet identifierar ogiltiga trianglar.

getTriangleScalene: 
Kontrollerar att koden korrekt identifierar SCALENE när triangeln skapas med sidorna 3, 4 och 5. Testet identifierar vilken triangeltyp det är.

getTriangleEquilateral: 
Kontrollerar att koden korrekt identifierar EQUILATERAL när triangeln skapas med sidorna 3, 3 och 3. Testet identifierar vilken triangeltyp det är.

getTriangleNegativeSides: 
Testar när en triangel skapas med negativa sidor att det blir null, eftersom det inte är en giltig triangel. Testet hanterar trianglar med ogiltig input.

getInvalidTriangle: 
Liknande getTriangleEquality men testar specifikt att skapa en triangel med sidorna 1, 1 och 3. Ännu ett test som säkerställer hanteringen av olika scenarier med ogiltiga trianglar.
