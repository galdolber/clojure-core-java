package clojure;

import clojure.lang.*;

public final class pprint_tokens_fit_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "get-max-column");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "buffer-length");
 }
 public pprint_tokens_fit_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object tokens2) {
  {
   Object maxcol3 = ((IFn)const__0.getRawRoot()).invoke(RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")));
   {
    boolean or__3968__auto__4 = clojure.lang.Util.identical(((java.lang.Object)maxcol3), ((java.lang.Object)null));
    if (or__3968__auto__4) {
     return (or__3968__auto__4 ? Boolean.TRUE : Boolean.FALSE);
    } else {
     return (clojure.lang.Numbers.lt(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((IFn)const__6.getRawRoot()).invoke(RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")))), ((java.lang.Object)((IFn)const__7.getRawRoot()).invoke(tokens2))))), ((java.lang.Object)maxcol3)) ? Boolean.TRUE : Boolean.FALSE);
    }
   }
  }
 }
}
