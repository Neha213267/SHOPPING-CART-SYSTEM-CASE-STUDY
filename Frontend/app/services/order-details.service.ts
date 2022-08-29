import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderDetailsService {

  constructor() { }
  fashionDetails = [
    
    {
      id:1,
      fashionName:"705 T-shirt",
      fashionDetails:"Latest trendy fitted Black T-shirt in soft printed cotton with a 705 logo on the side which can be styled with blue jeans and converse shoes",
      fashionComposition:"100% Cotton",
      fashionPrice:600,
      fashionImg:"https://images.unsplash.com/photo-1618354691373-d851c5c3a990?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8dHNoaXJ0c3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"
    },
    {
      id:2,
      fashionName:"Pavillion Tshirt",
      fashionDetails:"Oversized T-shirt in soft cotton jersey with a white paviliion print in square and rib-trimmed neckline with low dropped shoulders",
      fashionComposition:"100% cotton",
      fashionPrice:840,
      fashionImg:"https://images.unsplash.com/photo-1621951753015-740c699ab970?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHRzaGlydHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"
    },
    {
      id:3,
      fashionName:"Water is Life T-shirt",
      fashionDetails:"Black fitted tshirt in soft material with a multicolour logo WATER is LIFE in trendy colours ",
      fashionComposition:"80% cotton,20% polyester ",
      fashionPrice:740,
      fashionImg:"https://images.unsplash.com/photo-1644263701567-cfbff8604f11?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=409&q=80"
    },
    {
      id:4,
      fashionName:"Out-Cast T-shirt",
      fashionDetails:"White fitted tshirt in soft material with a red OUTCAST logo which complement the t-shirt",
      fashionComposition:"100% cotton",
      fashionPrice:650,
      fashionImg:"https://images.unsplash.com/photo-1527719327859-c6ce80353573?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80"
    },
    {
      id:5,
      fashionName:"Relaxed-fit T-shirt",
      fashionDetails:"Relaxed-fit T-shirt in heavy cotton jersey with a round neckline and printed logo of a hand in white ",
      fashionComposition:"60% cotton,40% polyester",
      fashionPrice:600,
      fashionImg:"https://images.unsplash.com/photo-1503341504253-dff4815485f1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDJ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=600&q=60"
    },
    {
      id:6,
      fashionName:"White T-shirt",
      fashionDetails:"Round-necked T-shirt in a soft cotton blend. The T-shirt incorporates COOLMAX functional fabric, a unique, soft, comfortable and fast-drying polyester fibre that efficiently wicks moisture while regulating temperature.",
      fashionComposition:"Cotton 60%, Polyester 40%",
      fashionPrice:500,
      fashionImg:"https://images.unsplash.com/photo-1618677603286-0ec56cb6e1b5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjJ8fHRzaGlydHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"
    }

  ]
}
