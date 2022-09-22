package io.github.ones1kk.assertion.core.clazz;

import io.github.ones1kk.assertion.core.AbstractAssert;
import io.github.ones1kk.assertion.core.Asserts;
import io.github.ones1kk.assertion.core.clazz.model.ClassAssert;
import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractClassAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        Class<ClassAssert> actual1 = ClassAssert.class;

        // when
        AbstractClassAssert<?> assert1 = new ClassAssert(actual1);
        AbstractClassAssert<?> assert2 = new ClassAssert(null);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractClassAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Class.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(Class.class);
            assert1.isNotAssignableFrom(AbstractClassAssert.class);
        });
    }

    @Test
    @DisplayName("Class method test")
    public void test2() throws Exception {
        // given
        Class<AbstractClassAssert> supperClass = AbstractClassAssert.class;
        Class<ClassAssert> subClass = ClassAssert.class;
        Class<ClassAssertInterface> interfaceClass = ClassAssertInterface.class;
        Class<AnnotationForTest> annotationClass = AnnotationForTest.class;
        Class<Asserts> finalClass = Asserts.class;
        Class<AbstractAssert> abstractClass = AbstractAssert.class;
        AnonymousClassForTest anonymousClass = new AnonymousClassForTest() {
            @Override
            public void doTest() {

            }
        };
        Class<EnumForTest> enumClass = EnumForTest.class;
        Class<MemberClassForTest> memberClass = MemberClassForTest.class;

        // when
        AbstractClassAssert<?> assert1 = new ClassAssert(supperClass);
        AbstractClassAssert<?> assert2 = new ClassAssert(subClass);
        AbstractClassAssert<?> assert3 = new ClassAssert(interfaceClass);
        AbstractClassAssert<?> assert4 = new ClassAssert(annotationClass);
        AbstractClassAssert<?> assert5 = new ClassAssert(finalClass);
        AbstractClassAssert<?> assert6 = new ClassAssert(abstractClass);
        AbstractClassAssert<?> assert7 = new ClassAssert(anonymousClass.getClass());
        AbstractClassAssert<?> assert8 = new ClassAssert(enumClass);
        AbstractClassAssert<?> assert9 = new ClassAssert(memberClass);

        // then
        assertThrows(AssertException.class, () -> assert1.isTypeOf(new String()));
        assertThrows(AssertException.class, () -> assert1.isNotTypeOf(new ClassAssert(supperClass)));
        assertThrows(AssertException.class, () -> assert2.isSuperclassOf(supperClass));
        assertThrows(AssertException.class, () -> assert1.isSubclassOf(subClass));
        assertThrows(AssertException.class, assert1::isInterface);
        assertThrows(AssertException.class, assert1::isAnnotation);
        assertThrows(AssertException.class, assert1::isFinalClass);
        assertThrows(AssertException.class, assert1::isAbstractClass);
        assertThrows(AssertException.class, assert1::isEnum);
        assertThrows(AssertException.class, assert1::isMemberClass);

        assertThatNoException().isThrownBy(() -> {
            assert1.isTypeOf(new ClassAssert(supperClass));
            assert1.isNotTypeOf(ClassAssert.class);
            assert1.isNotTypeOf(new String());
            assert1.isSuperclassOf(ClassAssert.class);
            assert2.isSubclassOf(AbstractClassAssert.class);
            assert3.isInterface();
            assert4.isAnnotation();
            assert5.isFinalClass();
            assert6.isAbstractClass();
            assert7.isAnonymousClass();
            assert8.isEnum();
            assert9.isMemberClass();
        });
    }

    static class MemberClassForTest {
    }
}