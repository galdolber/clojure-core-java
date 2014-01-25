package clojure;

import clojure.lang.*;

public final class xml_fn__6926_fn__6937 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.xml", "*current*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "peek");
  const__2 = (clojure.lang.Var)RT.var("clojure.xml", "*stack*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "pop");
  const__4 = (clojure.lang.Var)RT.var("clojure.xml", "*state*");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "between");
 }
 Object push_chars2;
 Object push_content1;
 public xml_fn__6926_fn__6937(final Object push_chars2, final Object push_content1) {
  super();
  this.push_chars2 = push_chars2;
  this.push_content1 = push_content1;
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object uri2, java.lang.Object local_name3, java.lang.Object q_name4) {
  ((IFn)this.push_chars2).invoke();
  const__0.set(((IFn)this.push_content1).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.get()), const__0.get()));
  const__2.set(((IFn)const__3.getRawRoot()).invoke(const__2.get()));
  const__4.set(const__5);
  return null;
 }
}
