package clojure;

import clojure.lang.*;

public final class core_slurp extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "normalize-slurp-opts");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.java.io", "reader");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "char");
 }
 public core_slurp() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object opts2) {
  try {
   {
    Object opts3 = ((IFn)const__0.getRawRoot()).invoke(opts2);
    Object sb4 = new java.lang.StringBuilder();
    {
     Object r5 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), f1, opts3);
     try {
      {
       long c8 = clojure.lang.RT.longCast((int)((java.io.Reader)r5).read());
       while(true) {
        if (clojure.lang.Numbers.isNeg((long)c8)) {
         return ((IFn)const__4.getRawRoot()).invoke(sb4);
        } else {
         ((java.lang.StringBuilder)sb4).append((char)clojure.lang.RT.charCast((long)c8));
         long c8___aux = ((java.io.Reader)r5).read();
         c8 = c8___aux;
         continue;
        }
       }
      }
     } finally {
      ((java.io.Reader)r5).close();
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
