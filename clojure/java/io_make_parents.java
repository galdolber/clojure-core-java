package clojure.java;

import clojure.lang.*;

public final class io_make_parents extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "file");
 }
 public io_make_parents() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object more2) {
  {
   Object temp__4117__auto__3 = ((java.io.File)((java.io.File)((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), f1, more2)).getParentFile());
   Object __r6312 = temp__4117__auto__3;
   if (__r6312 != null && !(__r6312 == Boolean.FALSE)) {
    {
     Object parent4 = temp__4117__auto__3;
     return (((java.io.File)parent4).mkdirs() ? Boolean.TRUE : Boolean.FALSE);
    }
   } else {
    return null;
   }
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
