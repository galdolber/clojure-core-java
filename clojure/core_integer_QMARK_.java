package clojure;

import clojure.lang.*;

public final class core_integer_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.lang.Integer.class;
  const__2 = (java.lang.Object)java.lang.Long.class;
  const__3 = (java.lang.Object)clojure.lang.BigInt.class;
  const__4 = (java.lang.Object)java.math.BigInteger.class;
  const__5 = (java.lang.Object)java.lang.Short.class;
  const__6 = (java.lang.Object)java.lang.Byte.class;
 }
 public core_integer_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  {
   boolean or__3968__auto__2 = (n1 instanceof java.lang.Integer);
   if (or__3968__auto__2) {
    return (or__3968__auto__2 ? Boolean.TRUE : Boolean.FALSE);
   } else {
    {
     boolean or__3968__auto__3 = (n1 instanceof java.lang.Long);
     if (or__3968__auto__3) {
      return (or__3968__auto__3 ? Boolean.TRUE : Boolean.FALSE);
     } else {
      {
       boolean or__3968__auto__4 = (n1 instanceof clojure.lang.BigInt);
       if (or__3968__auto__4) {
        return (or__3968__auto__4 ? Boolean.TRUE : Boolean.FALSE);
       } else {
        {
         boolean or__3968__auto__5 = (n1 instanceof java.math.BigInteger);
         if (or__3968__auto__5) {
          return (or__3968__auto__5 ? Boolean.TRUE : Boolean.FALSE);
         } else {
          {
           boolean or__3968__auto__6 = (n1 instanceof java.lang.Short);
           if (or__3968__auto__6) {
            return (or__3968__auto__6 ? Boolean.TRUE : Boolean.FALSE);
           } else {
            return ((n1 instanceof java.lang.Byte) ? Boolean.TRUE : Boolean.FALSE);
           }
          }
         }
        }
       }
      }
     }
    }
   }
  }
 }
}
