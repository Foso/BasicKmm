import SwiftUI
import shared

func greet() -> String {
    return Greeting().greeting()
}

struct ContentView: View {
    var body: some View {
        VStack{
            Text(greet())
            
            List(Greeting().getnicCageMovies(), id: \.title){
                ingredientName in
                Text(ingredientName.title)
            }
        }
       
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
