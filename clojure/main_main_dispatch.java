package clojure;

import clojure.lang.*;

public final class main_main_dispatch extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.main", "repl-opt");
  const__1 = (clojure.lang.Var)RT.var("clojure.main", "main-opt");
  const__2 = (clojure.lang.Var)RT.var("clojure.main", "null-opt");
  const__3 = (clojure.lang.Var)RT.var("clojure.main", "help-opt");
  const__4 = (clojure.lang.Var)RT.var("clojure.main", "script-opt");
 }
 public main_main_dispatch() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opt1) {
  {
   Object or__3968__auto__2 = ((IFn)RT.mapUniqueKeys("-r", const__0.getRawRoot(), "--repl", const__0.getRawRoot(), "-m", const__1.getRawRoot(), "--main", const__1.getRawRoot(), null, const__2.getRawRoot(), "-h", const__3.getRawRoot(), "--help", const__3.getRawRoot(), "-?", const__3.getRawRoot())).invoke(opt1);
   Object __r4484 = or__3968__auto__2;
   if (__r4484 != null && !(__r4484 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    return const__4.getRawRoot();
   }
  }
 }
}
