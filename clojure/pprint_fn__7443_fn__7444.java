package clojure;

import clojure.lang.*;

public final class pprint_fn__7443_fn__7444 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Keyword const__6;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "prefix");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "ref-set");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "start-col");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "indent");
 }
 Object lb5;
 Object this1;
 public pprint_fn__7443_fn__7444(final Object lb5, final Object this1) {
  super();
  this.lb5 = lb5;
  this.this1 = this1;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = RT.get(this.lb5, Keyword.intern(null, "prefix"));
   Object __r4862 = temp__4117__auto__1;
   if (__r4862 != null && !(__r4862 == Boolean.FALSE)) {
    {
     Object prefix2 = temp__4117__auto__1;
     Reflector.invokeInstanceMethod(RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{prefix2});
    }
   } else {
   }
  }
  {
   Object col3 = ((IFn)const__3.getRawRoot()).invoke(RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")));
   ((IFn)const__4.getRawRoot()).invoke(RT.get(this.lb5, Keyword.intern(null, "start-col")), col3);
   return ((IFn)const__4.getRawRoot()).invoke(RT.get(this.lb5, Keyword.intern(null, "indent")), col3);
  }
 }
}
