package clojure;

import clojure.lang.*;

public final class main_repl_read extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "line-start");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "stream-end");
  const__2 = (clojure.lang.Var)RT.var("clojure.main", "skip-whitespace");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*in*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "read");
  const__5 = (clojure.lang.Var)RT.var("clojure.main", "skip-if-eol");
 }
 public main_repl_read() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object request_prompt1, java.lang.Object request_exit2) {
  {
   Object or__3968__auto__3 = ((IFn)RT.mapUniqueKeys(const__0, request_prompt1, const__1, request_exit2)).invoke(((IFn)const__2.getRawRoot()).invoke(const__3.get()));
   Object __r4449 = or__3968__auto__3;
   if (__r4449 != null && !(__r4449 == Boolean.FALSE)) {
    return or__3968__auto__3;
   } else {
    {
     Object input4 = ((IFn)const__4.getRawRoot()).invoke();
     ((IFn)const__5.getRawRoot()).invoke(const__3.get());
     return input4;
    }
   }
  }
 }
}
